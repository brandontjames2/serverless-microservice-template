# serverless-microservice-template
Before starting:
* Setup AWS CLI
* run 'mvn clean package'

Working with lambdas:
* ./target/manage.sh is a script to help create/update/invoke/remove lambdas
* you will need to setup a role in AWS for the lambda before creating one
* when first creating a lambda you will need to include the arn resource of the role before calling the shell script like so:
    - LAMBDA_ROLE_ARN="arn:aws:iam::1234567890:role/lambda-role" sh target/manage.sh create
* run 'sh target/manage.sh invoke' to invoke your lambda, this will use ./payload.json as the InputObject and the output will be displayed in the console