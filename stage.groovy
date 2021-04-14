import hudson.model.*

pipeline{
    agent any
    stages{
        stage('拉取代码'){
            echo 'pull code'
        }
    }
}