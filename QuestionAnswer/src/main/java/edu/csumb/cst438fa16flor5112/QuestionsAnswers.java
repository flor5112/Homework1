package edu.csumb.cst438fa16flor5112;

import java.util.HashMap;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class QuestionsAnswers
{
	private HashMap<String,String> QandA = new HashMap<String,String>();
	   
	//inserts a new question into the map with answer
	public void put(String question, String answer)
	{
		  QandA.put(question, answer);
	}
	
	//checks whether the answer given matches the answer in the map 
	public boolean testAnswer(String question, String answer)
	{
		if(QandA.get(question).equals(answer))
		{
			return true;
		}
		return false;
		
	}
	
	//obtain a random question 
	public String getRandomQuestion()
	{
		Object[] questions = QandA.keySet().toArray();
		Object randomQ = questions[new Random().nextInt(questions.length)];
		
		return (String) randomQ;
		
	}
}
