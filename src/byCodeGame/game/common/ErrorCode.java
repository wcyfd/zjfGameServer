package byCodeGame.game.common;

/**
 * @author ming 创建时间：2014-10-17
 */

public class ErrorCode {
	public static final short ERROR = 0;
	public static final short SUCCESS = 1;
	public static final short SHORT_TWO = 2;

	/** 服务器正在维护 */
	public static final short SERVICE_CLOSED = 30001;
	/**
	 * 登录
	 */
	/** 注册信息不完整 */
	public static final short REGISTER_LACK_INFO = 30102;
	public static final short REGISTER_ACCOUNT_REPEAT = 30103;
	public static final short REGISTER_NAME_REPEAT = 30104;
	public static final short REGISTER_FAILED = 30105;
	public static final short NO_ROLE = 30106;

	/**
	 * 商品
	 */
	/** 商品不足 */
	public static final short MAKET_GOODS_LACK = 30202;
	/**
	 * 玩家
	 */
	/** 玩家名重复 */
	public static final short ROLE_NAME_REPEAT = 30201;

	/**
	 * 英雄
	 */
	/** 英雄领悟失败 */
	public static final short HERO_REALIZE_FAILED = 30301;
	public static final short HERO_MAX_TALENT = 30302;

}
