package tools;

import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: fengyadong
 * @create: 2018-09-17 09:58
 **/
public class test {

    public String gameId;
    public String gameName;

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public static void main(String[] args) {
        String gameListStr = "[{"gameId":"1","gameName":"哈哈"},{"gameId":"2","gameName":"呵呵"}]";
        List<test> gameList = JSONObject.parseArray(gameListStr, test.class);
    }
}
