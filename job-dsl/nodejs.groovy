job('NodeJS example') {
    scm {
        git('https://github.com/antocecere77/NodeJsCiCdWithJenkinsDocker.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('antocecere')
            node / gitConfigEmail('antocecere77@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
