job('Python Example'){
   scm {
      github('sxddhxrthx/python-app-jenkins-demo')
   }

   // poll the above mentioned repository every 5 minutes
   triggers{
      scm('H/5 * * * *')
   }

   // Adds pre/post actions to the job
   wrappers{
      colorizeOutput()
   }

   steps{
      shell('python3 --version')
   }

}