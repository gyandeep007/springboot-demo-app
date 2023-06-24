pipeline{
       agent any
        stages{
          stage('Init'){
             steps{
                echo 'Hi this is init step'
             }
          }
          stage('Build'){
              steps{
               sh 'mvn clean install'
              }
          }
          stage('deploy'){
              steps{
                echo 'Hi this is deploy step'
              }
          }
          stage('prod'){
              steps{
                echo 'Hi this is deploy step again'
              }
          }
        }

}
