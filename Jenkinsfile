pipeline {
    agent any

    stages {
        stage('Build and test') {
            steps {
                sh 'echo hello'
            }
        }

    }

    post {
        success {
            //junit 'target/**/*.xml'
            script {
                if (pullRequest.mergeable) {
                    pullRequest.merge([
                        commitMessage : 'Merged by Jenkins',
                        commitTitle : 'PR merged',
                        sha : pullRequest.head,
                        mergeMethod : 'merge'
                    ] )
                } else {
                    pullRequest.addLabel('No automerge')
                }
            }
        }
    }
}
