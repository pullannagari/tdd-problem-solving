package com.shoppingcart.testdrivendev;

public class Vote {
    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getVotestring() {
        return votestring;
    }

    public void setVotestring(String votestring) {
        this.votestring = votestring;
    }

    private String voterId;
    private String votestring;

    public Vote(String voterId, String votestring) {
        this.voterId = voterId;
        this.votestring = votestring;
    }
}
