
rm -r asyncapi-catalog-provider

ag \
-o asyncapi-catalog-provider \
-p springBootVersion=2.7.4-SNAPSHOT \
-p springCloudStreamVersion=2021.0.3 \
-p springCloudVersion=2021.0.3 \
-p view=provider \
https://raw.githubusercontent.com/finetech-dk/specs/main/asyncapi-catalog.yaml \
@asyncapi/java-spring-cloud-stream-template

git add .

rm -r asyncapi-catalog-client

ag \
-o asyncapi-catalog-client \
-p springBootVersion=2.7.4-SNAPSHOT \
-p springCloudStreamVersion=2021.0.3 \
-p springCloudVersion=2021.0.3 \
-p view=client \
https://raw.githubusercontent.com/finetech-dk/specs/main/asyncapi-catalog.yaml \
@asyncapi/java-spring-cloud-stream-template

git add .
