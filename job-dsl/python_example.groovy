job('Python Example'){
   scm {

      // git('git://github.com/wardviaene/docker-demo.git'){ node->
      //    node / gitConfigName('DSL User')
      //    node / gitConfigEmail('sid@jenkins.com')
      // }
      
      github('sxddhxrthx/python-app-jenkins-demo')
   }

   triggers{
      scm('H/5 * * * *')
   }

   // Adds pre/post actions to the job
   wrappers{
      colorizeOutput()
   }

   steps{
      shell('python --version')
   }

}