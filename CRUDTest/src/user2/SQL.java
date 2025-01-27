package user2;

public class SQL {
	public static final String INSERT_USER2 = "INSERT INTO `User2` VALUES (?,?,?,?)";
	public static final String SELECT_USER2_LIST = "SELECT * FROM `User2`";
	public static final String SELECT_USER2 = "SELECT * FROM `User2` WHERE `uid`=?";
	public static final String UPDATE_USER2 = "UPDATE `User2` SET `name`=?, `birth`=?, `addr`=? WHERE `uid`=?";
	public static final String DELETE_USER2 = "DELETE FROM `User2` WHERE `uid`=?";
}
