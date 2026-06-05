pipeline {

agent any

tools {
    jdk 'jdk21'
    maven 'Maven12'
}

stages {

    stage('Git Checkout') {
        steps {
            git branch: 'main',
                url: 'https://github.com/utkarsh-srivastava01/nopcommerce1_project.git'
        }
    }

    stage('Clean Project') {
        steps {
            bat 'mvn clean'
        }
    }

    stage('Run Tests') {
        steps {
            bat 'mvn test'
        }
    }

    stage('Publish Cucumber Report') {
        steps {
            publishHTML(target: [
                allowMissing: true,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'src/test/resources/Reports',
                reportFiles: 'cucumber-reports.html',
                reportName: 'nopcommerce Cucumber Report'
            ])
        }
    }

    stage('Publish TestNG Report') {
        steps {
            publishHTML(target: [
                allowMissing: true,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/surefire-reports',
                reportFiles: 'index.html',
                reportName: 'TestNG Report'
            ])
        }
    }
}

post {

    always {

        archiveArtifacts(
            artifacts: 'src/test/resources/Reports/*',
            allowEmptyArchive: true
        )

        junit allowEmptyResults: true,
              testResults: 'target/surefire-reports/*.xml'
    }

    success {
        echo 'Pipeline Executed Successfully'
    }

    failure {
        echo 'Pipeline Failed'
    }
}
}