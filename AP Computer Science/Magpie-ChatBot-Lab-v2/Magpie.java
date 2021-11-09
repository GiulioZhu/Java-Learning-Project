  public class Magpie
  {
	/**
     * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
  public boolean checkStringIsEmpty (String statement) {
    if (statement.trim().length() <= 0) {
        return true;
        //String empty
      } else {
        return false;
      }     
   
  } 
	public String getResponse(String statement)
	{
		String response = "";
  // check if statement has at least 1 character

  // chat  
		if (statement.indexOf("no") >= 0)
		{
			response = "Why are you so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		} else if (statement.indexOf("dog") >= 0 
        || statement.indexOf("cat") >= 0
        || statement.indexOf("parrot") >= 0)
    {
      response = "Yeah, what about your pet?";
    }
      else if (statement.indexOf("my teacher") >= 0 ||statement.indexOf("mr smith") >= 0)
      {
       int NUMBER_OF_RESPONSES = 2;
	    	double r = Math.random();
	    	int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        if (whichResponse == 0){ 
        response = "He sounds like a good teacher";
        } else {
        response = "He sounds like a decent teacher";
        }
      }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 9;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
    else if (whichResponse == 4)
		{
			response = "Where is it?";
		}
    else if (whichResponse == 5)
		{
			response = "I do not want to talk";
		}
    else if (whichResponse == 6)
		{
			response = "Huh huh.";
		}
    else if (whichResponse == 7)
		{
			response = "I can't understand you. Go again";
		}
    else if (whichResponse == 8)
		{
			response = "Can you rephrase it, please?";
		}

		return response;
	 }
}
