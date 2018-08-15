#/usr/bin/bash
# first parameter is which function to run: phone, acct, ert

# run one of the HVCA functions

# phone lookup and leave resut in phone.txt
if [ "$1" = "phone" ]
then
  /bin/rm -f phone.txt
  set -x 
  aws --profile hvca_user lambda invoke \
    --invocation-type RequestResponse \
    --function-name HVCA_phone_lookup \
    --region us-west-2 \
    --payload "6145654712" \
    --profile  hvca_user \
    --log-type Tail  phone.txt
  set +o xtrace
  cat phone.txt
  exit
fi


# account lookup and leave resut in acct.txt
if [ "$1" = "acct" ]
then
  rm -f acct.txt
  set -x
  aws --profile hvca_user lambda invoke \
    --invocation-type RequestResponse \
    --function-name HVCA_account_lookup \
    --region us-west-2 \
    --payload "6145654712" \
    --profile  hvca_user \
    --log-type Tail  acct.txt
  set +o xtrace
  cat acct.txt
  exit
fi


# ERT lookup and leave resut in ert.txt
if [ "$1" = "ert" ]
then
  rm -f ert.txt
  set -x 
  aws --profile hvca_user lambda invoke \
    --invocation-type RequestResponse \
    --function-name HVCA_get_ERT \
    --region us-west-2 \
    --payload "6145654712" \
    --profile  hvca_user \
    --log-type Tail ert.txt 
  set +o xtrace
  cat ert.txt
  exit
fi
