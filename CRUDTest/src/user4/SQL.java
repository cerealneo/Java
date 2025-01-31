package user4;

public class SQL {
	public static final String INSERT_USER4 = "INSERT INTO `User4` VALUES (?,?,?,?,?,?)";
	public static final String SELECT_USER4_LIST = "SELECT * FROM `User4`";
	public static final String SELECT_USER4 = "SELECT * FROM `User4` WHERE `uid`=?";
	public static final String UPDATE_USER4 = "UPDATE `User4` SET `name`=?,`gender`=?,`age`=?,`hp`=?, `addr`=? WHERE `uid`=?";
	public static final String DELETE_USER4 = "DELETE FROM `User4` WHERE `uid`=?";
}
