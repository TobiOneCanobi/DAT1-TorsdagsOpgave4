public class Team
{
	private String teamName;
	private int teamRank;
	private String playerNames;

	public Team(String teamName)
	{
		this.teamName = teamName;
	}

	public void setRank(int teamRank)
	{
		this.teamRank = teamRank;
	}

	public String toString()
	{
		return "Hold: " + teamName + ", rang: " + teamRank;
	}
}

