public class RE24 
{
	static int HomeRuns=7;
	static int Triples=6;
	static int Doubles=30;
	static int Singles=191;
	static int Walks=124;
	static int HitByPitches=26;
	static int ReachOnErrors=34;
	static int StrikeOuts=182;
	static int innings = 1000000;
	static int runs = 0;
	static int A=0,B=0,C=0,D=0,E=0,F=0,G=0,H=0,I=0,J=0,K=0,L=0,M=0,N=0,O=0,P=0,Q=0,R=0,S=0,T=0,U=0,V=0,W=0,X=0;
	public static void main(String[]args)
	{
		for(int i = 0 ; i < innings ; i++)
		{
			int [] bases = {1,1,0,0};
			int Outs = 1;
			while(Outs<3)
			{
				
				//variation by player happens up here
				playRE24 play = new playRE24();
				play.play(HomeRuns,Triples,Doubles,Singles,Walks,HitByPitches,ReachOnErrors,StrikeOuts);
				
				/*situation evaluation
				if(Outs==0)
				{
					if((bases[0]==0)&&(bases[1]==0)&&(bases[2]==0))
						V++;
					else if((bases[0]==0)&&(bases[1]==1)&&(bases[2]==0))
						P++;
					else if((bases[0]==0)&&(bases[1]==0)&&(bases[2]==1))
						M++;
					else if((bases[0]==0)&&(bases[1]==1)&&(bases[2]==1))
						D++;
					else if((bases[0]==1)&&(bases[1]==0)&&(bases[2]==1))
						G++;
					else if((bases[0]==1)&&(bases[1]==1)&&(bases[2]==1))
						A++;
					else if((bases[0]==1)&&(bases[1]==0)&&(bases[2]==0))
						S++;
					else if((bases[0]==1)&&(bases[1]==1)&&(bases[2]==0))
						J++;
				}
				else if(Outs==1)
				{
					if((bases[0]==0)&&(bases[1]==0)&&(bases[2]==0))
						W++;
					else if((bases[0]==0)&&(bases[1]==1)&&(bases[2]==0))
						Q++;
					else if((bases[0]==0)&&(bases[1]==0)&&(bases[2]==1))
						N++;
					else if((bases[0]==0)&&(bases[1]==1)&&(bases[2]==1))
						E++;
					else if((bases[0]==1)&&(bases[1]==0)&&(bases[2]==1))
						H++;
					else if((bases[0]==1)&&(bases[1]==1)&&(bases[2]==1))
						B++;
					else if((bases[0]==1)&&(bases[1]==0)&&(bases[2]==0))
						T++;
					else if((bases[0]==1)&&(bases[1]==1)&&(bases[2]==0))
						K++;
				}
				else if(Outs==2)
				{
					if((bases[0]==0)&&(bases[1]==0)&&(bases[2]==0))
						X++;
					else if((bases[0]==0)&&(bases[1]==1)&&(bases[2]==0))
						R++;
					else if((bases[0]==0)&&(bases[1]==0)&&(bases[2]==1))
						O++;
					else if((bases[0]==0)&&(bases[1]==1)&&(bases[2]==1))
						F++;
					else if((bases[0]==1)&&(bases[1]==0)&&(bases[2]==1))
						I++;
					else if((bases[0]==1)&&(bases[1]==1)&&(bases[2]==1))
						C++;
					else if((bases[0]==1)&&(bases[1]==0)&&(bases[2]==0))
						U++;
					else if((bases[0]==1)&&(bases[1]==1)&&(bases[2]==0))
						L++;
				}*/
				
				if((play.getResult().equals("Walk"))||(play.getResult().equals("Hit By Pitch")))
				{
					bases[0]++;
					if(bases[0]>1)
					{
						bases[0]--;
						bases[1]++;
						if(bases[1]>1)
						{
							bases[1]--;
							bases[2]++;
							if(bases[2]>1)
							{
								bases[2]--;
								bases[3]++;
							}
						}
					}
				}
				if(play.getResult().equals("Home Run"))
				{
					bases[3]++;
					if(bases[0]==1)
					{
						bases[0]--;
						bases[3]++;
					}
					if(bases[1]==1)
					{
						bases[1]--;
						bases[3]++;
					}
					if(bases[2]==1)
					{
						bases[2]--;
						bases[3]++;
					}
				}
				if(play.getResult().equals("Triple"))
				{
					if(bases[0]==1)
					{
						bases[0]--;
						bases[3]++;
					}
					if(bases[1]==1)
					{
						bases[1]--;
						bases[3]++;
					}
					if(bases[2]==1)
					{
						bases[2]--;
						bases[3]++;
					}
					bases[2]++;
				}
				if(play.getResult().equals("Double"))
				{
					if(bases[2]==1)
					{
						bases[2]--;
						bases[3]++;
					}
					if(bases[1]==1)
					{
						bases[1]--;
						bases[3]++;
					}
					if(bases[0]==1)
					{
						bases[0]--;
						int random2=(int)(Math.random()*1000);
						if(random2<552)
						{
							bases[2]++;
						}
						else if(random2<622)
						{
							Outs++;
						}
						else
						{
							bases[3]++;
						}
					}
					bases[1]++;
				}
				if(play.getResult().equals("Single"))
				{
					if(bases[2]==1)
					{
						bases[2]--;
						bases[3]++;
					}
					if(bases[1]==1)
					{
						bases[1]--;
						int random2=(int)(Math.random()*1000);
						if(random2<373)
						{
							bases[2]++;
							if(bases[0]==1)
							{
								bases[0]--;
								bases[1]++;
							}
						}
						else if(random2<543)
						{
							Outs++;
						}
						else
						{
							bases[3]++;
						}
					}
					if(bases[0]==1)
					{
						bases[0]--;
						int random2=(int)(Math.random()*1000);
						if(random2<686)
						{
							bases[1]++;
						}
						else if(random2<700)
						{
							Outs++;
						}
						else
						{
							bases[2]++;
						}
					}
					bases[0]++;
				}
				if(play.getResult().equals("Strike Out"))
				{
					Outs++;
				}
				if(play.getResult().equals("Ground Out"))
				{
					Outs++;
					int random2=(int)(Math.random()*1000);
					//Not efficient, deal with it
					if(bases[0]==1 && bases[1]==0 && bases[2]==0 && Outs<3)
					{
						if(random2<150)
						{
							bases[0]--;
							Outs++;
						}
						else 
						{
							bases[0]--;
							bases[1]++;
						}
					}
					else if(bases[0]==0 && bases[1]==1 && bases[2]==0 && Outs<3)
					{
						if(random2<650)
						{
							bases[1]--;
							bases[2]++;
						}
					}
					else if(bases[0]==0 && bases[1]==0 && bases[2]==1 && Outs<3)
					{
						if(random2<800)
						{
							bases[2]--;
							bases[3]++;
						}
					}
					else if(bases[0]==1 && bases[1]==1 && bases[2]==0 && Outs<3)
					{
						bases[1]--;
						bases[2]++;
						if(random2<150)
						{
							bases[0]--;
							Outs++;
						}
						else 
						{
							bases[0]--;
							bases[1]++;
						}
						
					}
					else if(bases[0]==1 && bases[1]==0 && bases[2]==1 && Outs<3)
					{
						if(random2<150)
						{
							bases[0]--;
							Outs++;
							if(Outs<3)
							{
								bases[2]--;
								bases[3]++;
							}
						}
						else 
						{
							bases[0]--;
							bases[1]++;
							random2=(int)(Math.random()*1000);
							if(random2<800)
							{
								bases[2]--;
								bases[3]++;
							}
						}
					}
					else if(bases[0]==0 && bases[1]==1 && bases[2]==1 && Outs<3)
					{
						if(random2<800)
						{
							bases[2]--;
							bases[3]++;
							random2=(int)(Math.random()*1000);
							if(random2<650)
							{
								bases[1]--;
								bases[2]++;
							}
						}
					}
					else if(bases[0]==1 && bases[1]==1 && bases[2]==1 && Outs<3)
					{
						if(random2<150)
						{
							bases[0]--;
							Outs++;
						}
						else 
						{
							bases[0]--;
							bases[1]++;
						}
						if(Outs<3)
						{
							bases[1]--;
							bases[3]++;
						}
					}
				}
				if(play.getResult().equals("Fly Out"))
				{
					Outs++;
					if((bases[2]==1)&&(Outs<2))
					{
						int random2=(int)(Math.random()*1000);
						if(random2<352)
						{
							bases[2]--;
							bases[3]++;
						}
					}
				}
				runs=runs+bases[3];
				bases[3]=0;
				
				System.out.println(play.getResult());
				System.out.println(bases[0]+"-"+(2*bases[1])+"-"+(3*bases[2])+", "+Outs+" Out(s)");
				System.out.println("Total runs: "+runs+" , Inning: "+(i+1));
				System.out.println("");
			}
		}
		System.out.println("Average Run Expectancy of Scenario: "+(((1000*runs)/innings)/1000)+"."+(((1000*runs)/innings)%1000));
		/*System.out.println("");
		System.out.println("A: "+A+" B: "+B+" C: "+C);
		System.out.println("D: "+D+" E: "+E+" F: "+F);
		System.out.println("G: "+G+" H: "+H+" I: "+I);
		System.out.println("J: "+J+" K: "+K+" L: "+L);
		System.out.println("M: "+M+" N: "+N+" O: "+O);
		System.out.println("P: "+P+" Q: "+Q+" R: "+R);
		System.out.println("S: "+S+" T: "+T+" U: "+U);
		System.out.println("V: "+V+" W: "+W+" X: "+X);*/
	}
}
