#!/user/bin/env groovy

def call() {
    echo "building the java application with maven for branch $BRANCH_NAME"
    sh 'mvn package'
}