package user3;

public class SQL {
	public static final String INSERT_USER3 = "INSERT INTO `User3` VALUES (?,?,?,?,?)";
	public static final String SELECT_USER3_LIST = "SELECT * FROM `User3`";
	public static final String SELECT_USER3 = "SELECT * FROM `User3` WHERE `uid`=?";
	public static final String UPDATE_USER3 = "UPDATE `User3` SET `name`=?, `birth`=?,`hp`=?,`addr`=? WHERE `uid`=?";
	public static final String DELETE_USER3 = "DELETE FROM `User3` WHERE `uid`=?";
}
