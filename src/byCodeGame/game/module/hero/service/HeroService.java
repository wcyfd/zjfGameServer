/**
 * 
 */
/**
 * @author AIM
 *
 */
package byCodeGame.game.module.hero.service;

import byCodeGame.game.entity.bo.Hero;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.module.Service;
import byCodeGame.game.remote.Message;

public interface HeroService extends Service {

	/**
	 * 创建单个英雄
	 * @return
	 */
	Hero createHero(Role role,int heroId);

	/**
	 * 改变技能
	 * @param skillId
	 * @return
	 */
	Message changeSkill(int skillId);

	/**
	 * 显示武将技能
	 * @param role
	 * @param heroId
	 * @return
	 */
	Message showHeroSkill(Role role, int heroId);

	/**
	 * 工作
	 * @param role
	 * @param heroId
	 * @return
	 */
	Message work(Role role, int heroId);

	/**
	 * 领悟
	 * @param role
	 * @param heroId
	 * @return
	 */
	Message realize(Role role,int heroId);
	
	/**
	 * 转生
	 * @param role
	 * @param heroId
	 * @return
	 */
	Message rebirth(Role role,int heroId);
	
	/**
	 * 学习技能
	 * @param role
	 * @param heroId
	 * @return
	 */
	Message learnSkill(Role role,int heroId);
	
	/**
	 * 显示英雄
	 * @param role
	 * @return
	 */
	Message showHero(Role role);
}