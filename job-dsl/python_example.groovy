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

   wrappers{
      nodejs('node.js')
   }

   steps{
      shell('npm install')
   }

}