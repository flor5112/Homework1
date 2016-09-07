package edu.csumb.cst438fa16flor5112;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * .
 */
public class QuestionsAnswersTest
{
	@Test
	   public void isCorrectAnswerTest()
	   {
		   QuestionsAnswers test = new QuestionsAnswers(); 
		   
		   //insert questions and answers 
		   test.put("What is my name?", "Miriam");
		   test.put("What is CSUMB's mascot?", "otter");
		   
		   //test testAnswer function 
		   
		   assertEquals(false,test.testAnswer("What is my name?", "Alex"));
		   assertEquals(true,test.testAnswer("What is CSUMB's mascot?","otter"));
	   }
}
