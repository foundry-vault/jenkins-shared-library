#!/user/bin/env groovy

def call() {
    echo "building the application for branch master"
    sh 'mvn package'
}
