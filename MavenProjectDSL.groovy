job('First_Maven_Job_Via_DSL') {
    description('Job created via DSL.')

    scm {
        github('https://github.com/joy3000/udemy-jenkins.git', '*/main')
    }

    triggers {
        scm('* * * * *')
    }

    steps {
        maven('clean package', 'pom.xml')
    }

    publishers {
        archiveArtifacts 'target/*.jar'
    }
}