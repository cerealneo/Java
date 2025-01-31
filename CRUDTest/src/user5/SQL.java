package user5;

public class SQL {
	public static final String INSERT_USER5 = "INSERT INTO `User5` SET "
																			+ "`name`=?,"
																			+ "`gender`=?,"
																			+ "`age`=?,"
																			+ "`addr`=?";
	public static final String SELECT_USER5_LIST = "SELECT * FROM `User5`";
	public static final String SELECT_USER5 = "SELECT * FROM `User5` WHERE `seq`=?";
	public static final String UPDATE_USER5 = "UPDATE `User5` SET "
																			+ "`name`=?,"
																			+ "`gender`=?,"
																			+"`age`=?,"
																			+ "`addr`=? "
																			+ "WHERE `seq`=?";
	public static final String DELETE_USER5 = "DELETE FROM `User5` WHERE `seq`=?";
}
