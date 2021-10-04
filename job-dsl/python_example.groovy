job('Python Example'){
   scm {
      git('git://github.com/wardviaene/docker-demo.git'){ node->
         node / gitConfigName('DSL User')
         node / gitConfigEmail('sid@jenkins.com')
      }
   }

   triggers{
      scm('H/5 * * * *')
   }

   // Adds pre/post actions to the job
   wrappers{
      colorizeOutput()

      python{
         pythonName('python36')
      }
   }

   steps{
      shell('python --version')
   }

}