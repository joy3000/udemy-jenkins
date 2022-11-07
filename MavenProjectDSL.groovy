job('First_Maven_Job_Via_DSL') {
    description('Job created via DSL.')

    scm {
        github('joy3000/udemy-jenkins', '*/main')
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