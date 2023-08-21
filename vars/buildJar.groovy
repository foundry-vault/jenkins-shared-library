#!/user/bin/env groovy

def call() {
    echo 'building the java application with maven...'
    sh 'mvn package'
}