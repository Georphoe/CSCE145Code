/*
 * Written by Tze-Chen Lin aka Georphoe Lin
 */
import java.util.Scanner;
public class ChooseYourOwnAdventure {

	public static final int collegeFactor = 2;
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Welcome to LIFE, choose wisely!\n");
		int k = 0; //knowledge
		int i = 0;//interest
		int s = 0;//stress
		boolean art = false;
		boolean sport = false;
		boolean yt = false;
		String job = "office worker";
		
		//###1st
		System.out.println("You are now in elementary school 1st grade, what would you spend most of your time on?\nYou could either study or make friends or explore your own interest.\nEnter \"s\" for studying or \"f\" for making friends or \"i\" for exploring your own interest.");
		
		String answer = keyboard.nextLine();
		if(answer.equalsIgnoreCase("s"))
		{
			k += 2;
			s += 2;
		}
		else if (answer.equalsIgnoreCase("f"))
		{
			k += 1;
			s -= 1;
		}
		else if (answer.equalsIgnoreCase("i"))
		{
			i += 1;
			s -= 1;
		}
		else
		{
			System.out.println("choose wisely and don't type anything wrong!");
		}
		
		//###3rd
		System.out.println("You are now in 3rd grade, what would you spend most of your time on?\nYou could either study or make friends or explore your own interest.\nEnter \"s\" for studying or \"f\" for making friends or \"i\" for exploring your own interest.");
		
		answer = keyboard.nextLine();
		if(answer.equalsIgnoreCase("s"))
		{
			k += 2;
			s += 2;
		}
		else if (answer.equalsIgnoreCase("f"))
		{
			k += 1;
			s -= 1;
		}
		else if (answer.equalsIgnoreCase("i"))
		{
			i += 1;
			s -= 1;
		}
		else
		{
			System.out.println("choose wisely and don't type anything wrong!");
		}
		
		//###5th
		System.out.println("You are now in 5th grade, what would you spend most of your time on?\nEnter \"s\" for studying or \"f\" for makeing friends or \"i\" for exploreing your own interest.");
		
	    answer = keyboard.nextLine();
		if(answer.equalsIgnoreCase("s"))
		{
			k += 2;
			s += 2;
		}
		else if (answer.equalsIgnoreCase("f"))
		{
			k += 1;
			s -= 1;
		}
		else if (answer.equalsIgnoreCase("i"))
		{
			i += 1;
			s -= 1;
		}
		else
		{
			System.out.println("choose wisely and don't type anything wrong!");
		}
		
		//###learn art & music
		if(i>0)
		{
			System.out.println("You find art and music very interesting, do you want to learn it?\nEnter\"true\" or \"false\"");
			boolean artAnswer = keyboard.nextBoolean();// 要Error check的話 設定String artanswer然後再 寫if playagain != ture, playagain = false)?
			keyboard.nextLine(); // ah-ha! boom! fix-up!! You almost got me LOL
			if(artAnswer)
			{
				art=true;
				System.out.println("You started to learn art & music");
			}	
			else
			{
				System.out.println("Too bad...");
			}
		}
		System.out.println("Congrats! You made it to middle school.");
		
		//###7th
		System.out.println("You are now in 7th grade, what would you spend most of your time on?\nEnter \"s\" for studying or \"f\" for makeing friends or \"i\" for exploreing your own interest.");
		
	    answer = keyboard.nextLine();
		if(answer.equalsIgnoreCase("s"))
		{
			k += 2;
			s += 2;
		}
		else if (answer.equalsIgnoreCase("f"))
		{
			k += 1;
			s -= 1;
		}
		else if (answer.equalsIgnoreCase("i"))
		{
			i += 1;
			s -= 1;
		}
		else
		{
			System.out.println("choose wisely and don't type anything wrong!");
		}
		
		//###learn sport
		if(i>1)
		{
			System.out.println("You find sports very interesting, do you want to learn it?/nEnter\"true\" or \"false\"");
			boolean sportAnswer = keyboard.nextBoolean();
			keyboard.nextLine();
			if(sportAnswer)
			{
				sport=true;
				System.out.println("You started to learn sprots");
			}	
			else
			{
				System.out.println("Too bad...");
			}
		}
		
		//###9th
		System.out.println("You are now in 9th grade, what would you spend most of your time on?\nEnter \"s\" for studying or \"f\" for makeing friends or \"i\" for exploreing your own interest.");
		
	    answer = keyboard.nextLine();
		if(answer.equalsIgnoreCase("s"))
		{
			k += 2;
			s += 2;
		}
		else if (answer.equalsIgnoreCase("f"))
		{
			k += 1;
			s -= 1;
		}
		else if (answer.equalsIgnoreCase("i"))
		{
			i += 1;
			s -= 1;
		}
		else
		{
			System.out.println("choose wisely and don't type anything wrong!");
		}
		
		System.out.println("Congrats! You made it to high school.");
		
		
		//###10th
		System.out.println("You are now in 10th grade, what would you spend most of your time on?\nEnter \"s\" for studying or \"f\" for makeing friends or \"i\" for exploreing your own interest.");
		
	    answer = keyboard.nextLine();
		if(answer.equalsIgnoreCase("s"))
		{
			k += 2;
			s += 2;
		}
		else if (answer.equalsIgnoreCase("f"))
		{
			k += 1;
			s -= 1;
		}
		else if (answer.equalsIgnoreCase("i"))
		{
			i += 1;
			s -= 1;
		}
		else
		{
			System.out.println("choose wisely and don't type anything wrong!");
		}
		
		//###learn YouTube
		if(i>4)
		{
			System.out.println("You find being an influencer very interesting, do you want become one?/nEnter\"true\" or \"false\"");
			boolean ytAnswer = keyboard.nextBoolean();
			keyboard.nextLine();
			if(ytAnswer)
			{
				yt=true;
				System.out.println("You started to learn how to become an influencer");
			}	
			else
			{
				System.out.println("alright...");
			}
		}
		
		//###12th
		System.out.println("You are now in 12th grade, what would you spend most of your time on?\nEnter \"s\" for studying or \"f\" for makeing friends or \"i\" for exploreing your own interest.");
		
	    answer = keyboard.nextLine();
		if(answer.equalsIgnoreCase("s"))
		{
			k += 2;
			s += 2;
		}
		else if (answer.equalsIgnoreCase("f"))
		{
			k += 1;
			s -= 1;
		}
		else if (answer.equalsIgnoreCase("i"))
		{
			i += 1;
			s -= 1;
		}
		else
		{
			System.out.println("choose wisely and don't type anything wrong!");
		}
		
		
		//###go to college or go to work
		if(art||sport||yt)
		{
			System.out.println("You have cultivated a lot of interests, you can now decide to go to college,\nor instead, don't go to college and turn your interest into a profession now.\nDo you want to go to college? Enter\"true\" or \"false\".");
			
			boolean collegeAnswer = keyboard.nextBoolean();
			keyboard.nextLine();
			if(!collegeAnswer)
			{
				if(art)
				{
					System.out.println("Do you want to become an artist?\nEnter \"true\" or \"false\"");
					boolean beArt = keyboard.nextBoolean();
					keyboard.nextLine();
					if(beArt)
					{
						System.out.println("You became an artice and lived happy ever after");
						System.exit(0);
					}
				}	
				if(sport)
				{
					System.out.println("Do you want to become an athlete?\nEnter \"true\" or \"false\"");
					boolean beSport = keyboard.nextBoolean();
					keyboard.nextLine();
					if(beSport)
					{
						System.out.println("You became an athlete and lived happy ever after");
						System.exit(0);
					}
				}
				if(yt)
				{
					System.out.println("Do you want to become an Youtuber?\nEnter \"true\" or \"false\"");
					boolean beYt = keyboard.nextBoolean();
					keyboard.nextLine();
					if(beYt)
					{
						System.out.println("You became an Youtuber and lived happy ever after");
						System.exit(0);
					}
				}
				System.out.println("You didn't turn your interest into a profession and you didn't go to college.\nYou work part-time and live lonely for the rest of your life.");
				System.exit(0);
				
			}
			if(k<7)
			{
				System.out.println("You tried to get into college, but you didn't study hard enough\nYou work part-time and live lonely for the rest of your life.");
				System.exit(0);
			}
				
			
		}
		if(k<7)
		{
			System.out.println("You tried to get into college, but you didn't study hard enough\nYou work part-time and live lonely for the rest of your life.");
			System.exit(0);
		}
		
		//###college
		System.out.println("Congrats! You made it to college school.");
		if(k>8)
		{
			System.out.println("You worked hard at school, so you were accepted by law school and med school\nDo you want to go to either of them?\nEnter\"true\" or \"false\".");
			boolean lawAndMedAnswer = keyboard.nextBoolean();
			keyboard.nextLine();
			if(lawAndMedAnswer)
			{
				System.out.println("Which one do you want to go?\nEnter \"law\" or \"med\".");
				String lawOrMedAnswer = keyboard.nextLine();
				
				if(lawOrMedAnswer.equalsIgnoreCase("law"))
				{
					job = "lawer";
				}
				else if (lawOrMedAnswer.equalsIgnoreCase("med"))
				{
					job = "doctor";
				}
				else
				{
					System.out.println("Sorry, you lose the chance.");
				}
			}
			else
			{
				System.out.println("Sorry, you lose the chance.");
			}
		}
		if(job.equalsIgnoreCase("office worker"))
		{
			System.out.println("Choose a major from\"Business\", \"Education\", \"Engineer\", \"humanities\".");
			String major = keyboard.nextLine();
			if(major.equalsIgnoreCase("Business"))
			{
				job = "businessman";
			}
			else if (major.equalsIgnoreCase("Education"))
			{
				job = "teacher";
			}
			else if (major.equalsIgnoreCase("Engineer"))
			{
				job = "engineer";
			}
			else if (major.equalsIgnoreCase("humanities"))
			{
				job = "scholar";
			}
			else
			{
				System.out.println("You drop out of college and work part-time and live lonely ever after.");
				System.exit(0);
			}
		}
		
		//###freshman
		System.out.println("You are now a freshman, what would you spend most of your time on?\nEnter \"s\" for studying or \"f\" for makeing friends or \"i\" for exploreing your own interest.");
		
	    answer = keyboard.nextLine();
		if(answer.equalsIgnoreCase("s"))
		{
			k += (2*collegeFactor);
			s += (2*collegeFactor);
		}
		else if (answer.equalsIgnoreCase("f"))
		{
			k += (1*collegeFactor);
			s -= (1*collegeFactor);
		}
		else if (answer.equalsIgnoreCase("i"))
		{
			i += (1*collegeFactor);
			s -= (1*collegeFactor);
		}
		else
		{
			System.out.println("choose wisely and don't type anything wrong!");
		}
		
		
		
		
		
		//###junior
		System.out.println("You are now a junior, what would you spend most of your time on?\nEnter \"s\" for studying or \"f\" for makeing friends or \"i\" for exploreing your own interest.");
		
	    answer = keyboard.nextLine();
		if(answer.equalsIgnoreCase("s"))
		{
			k += (2*collegeFactor);
			s += (2*collegeFactor);
		}
		else if (answer.equalsIgnoreCase("f"))
		{
			k += (1*collegeFactor);
			s -= (1*collegeFactor);
		}
		else if (answer.equalsIgnoreCase("i"))
		{
			i += (1*collegeFactor);
			s -= (1*collegeFactor);
		}
		else
		{
			System.out.println("choose wisely and don't type anything wrong!");
		}
		
		if(s>11)
		{
			System.out.println("STUDY STUDY STDUY!!, yon can't take it anymore, you have an emotional breakdown and move to a mountain with no signal. You spend the rest of your life living alone in the mountain.");
			System.exit(0);
		}
		
		
		//###ending!
		
		System.out.println("After years of hard work, you are now a successful "+ job+" ,");
		if(k>12)
		{
			System.out.println("and makes tons and tons of money,");
		}
		else if (k>8)
		{
			System.out.println("and makes pretty good money,");
		}
		else 
		{
			System.out.println("well.... actually not that successful, you can only barely feed yourself,");
		}
		
		if(i>3)
		{
			System.out.println("you live a happy life doing things you like in your free time.");
		}
		else
		{
			System.out.println("Also, you live a depressing life because you have no interests.");
		}
		
		System.out.println("Thanks for playing");
		//System.out.println("knowledge:interest:stress ="+k+" : "+i+" : "+s+"\n art: "+art +"\n sport: "+ sport+"\n yt: " + yt);
	}

}
