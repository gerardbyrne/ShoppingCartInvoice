pipeline
{
    /*Agent
      An agent is typically a machine, or container, which
      connects to a Jenkins master and executes tasks when
      directed by the master.
    */
    agent any
// Create the stages to be used in our pipeline
    stages
    {
        // Create the first stage to be used in our pipeline
        stage('Compile Stage')
        {
           /* Create the steps in this stage
              Clean the project using the clean lifecycle –
              before the new build.
              Compile by default will download external
              dependencies from remote repositories.
              Install then packages the application into the
              local repository, which by default is at the
              User Home Directory/.m2/repository/.
              */
            steps{
                    bat 'mvn clean compile install'
                 }  // End of steps for stage one
        }

        // Create the second stage to be used in our pipeline
        stage('Testing Stage')
        {
           /* Create the steps in this stage
              Here we will run the two test files
              using the Maven surefire Plugin which
              is used during the test phase of the
              build lifecycle to execute the unit
              tests of an application. It generates
              reports in two different file formats:
               Plain text files (*.txt)
               XML files (*.xml)*/
            steps{
                    bat 'mvn surefire:test -Dtest=*.java'
                 }  // End of steps for stage two
        }

         // Create the fourth stage to be used in our pipeline
         stage('Package Stage')
         {
              /* Create the steps in this stage
               packages the compiled code and other files
               into a single file. The type of final file
               being created depends on what we have defined
               in <packaging> in our pom.xml.
               the valid packaging values are jar, war, ear
               and pom. Jar is the default */
              steps{
                     bat 'mvn package'
                  }  // End of steps for stage four
         }

        /* Create the fifth stage to be used in our pipeline
        to check for user input. */
        stage('User Control Stage') {
            steps {
                input "Do you want to deploy?"
            }
        }
        // Create the sixth stage to be used in our pipeline
       // stage('Deployment Stage')
      //  {
             // Create the steps in this stage
     //        steps{
     //               bat 'mvn deploy'
     //            }  // End of steps for stage three
     //   }


    }   // End of stages
}   // End of pipeline