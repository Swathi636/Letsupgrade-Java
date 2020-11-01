package com.quizapplication;

public class QuizGame {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"NASA launched the ‘OSIRIS-REx’ Mission to collect samples from which asteroid?","Reliance Jio has launched which digital wallet service for peoples?","Which service is used for sending or receiving mail on the internet?"};
    String[] options1={"Asteroid Bennu","Airtal","twitter"};
    String[] options2={"Cristiano Robert","Reliance Money","internet"};
    String[] options3={"Robert Paul","JioMoney","skype"};
    String[] options4={"Mark Admin","Jio app","Email"};
    int[] answers={1,3,4};


    public void initGame()
    {

        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<3;i++)
        {

        questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAnswer=answers[i];
        }
    }
    public void play()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("Very well played!!");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("Sorry,I can't help you");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }

}