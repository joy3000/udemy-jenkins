job('First_Maven_Job_Via_DSL') {
    description('Job created via DSL.')

    scm {
        github('https://github.com/joy3000/udemy-jenkins.git', main)
    }

    triggers {
        scm('* * * * *')
    }

    steps {
        maven('clean package', 'pom.xml')
    }

    publisher {
        archiveArtifacts 'target/*.jar'
    }
}