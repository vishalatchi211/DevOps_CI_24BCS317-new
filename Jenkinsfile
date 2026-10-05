pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat '"C:\\Program Files\\Apache\\apache-maven-3.10.0-bin\\apache-maven-3.10.0\\bin\\mvn.cmd" -B -DskipTests package'
            }
        }

        stage('Test') {
            steps {
                bat '"C:\\Program Files\\Apache\\apache-maven-3.10.0-bin\\apache-maven-3.10.0\\bin\\mvn.cmd" -B test'
            }
        }

        stage('Result') {
            steps {
                echo 'Pipeline completed successfully.'
            }
        }
    }
}