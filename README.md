# ph-template-repo
Template repo for new repositories to clone

You can refer to this repo for base project to start with. You can clone this to your repo.

It has Spring Boot framework using logback and builds on Gradle. Also added Github Action to build on every push to repo.

## To test this repo
1. To Build:  ./gradlew build
2. To Run: ./gradlew bootRun
3. To Release ./gradlew release -Prelease.useAutomaticVersion=true


##To clone this repo to your new repo
```
1. mkdir temp
2. git clone --bare https://github.com/bring/ph-template-repo.git
3. cd ph-template-repo
4. git push --mirror https://github.com/bring/new-repository-name.git
5. cd ..
6. rm -rf temp
```

##To run the test case on local with TestContainer(TC) for Postgres
When test case `CustomerRepositoryIntegrationTest` runs on local it will use Postgres on local environment, but
in Github Action it will use Dockerized version of Postgres 11.1. It uses JDBC Support from TestContainer.
It will read configurations from application-ci.yml.
When TestContainer sees jdbc:tc:postgresql:9.6.8:///databasename in JDBC_URL it will start TC automagically
Ref: https://www.testcontainers.org/modules/databases/jdbc/
To simulate Github Action CI build on local
```
SPRING_PROFILES_ACTIVE=ci ./gradlew build
```