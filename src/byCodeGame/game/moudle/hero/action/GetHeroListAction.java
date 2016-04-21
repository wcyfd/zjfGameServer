package byCodeGame.game.moudle.hero.action;

import org.apache.mina.core.session.IoSession;

import byCodeGame.game.cache.local.RoleCache;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.moudle.hero.service.HeroService;
import byCodeGame.game.navigation.ActionSupport;
import byCodeGame.game.remote.Message;

public class GetHeroListAction implements ActionSupport {

	private HeroService heroService;
	public void setHeroService(HeroService heroService) {
		this.heroService = heroService;
	}
	
	@Override
	public void execute(Message message, IoSession session) {
		Role role = RoleCache.getRoleBySession(session);
		
		Message msg = heroService.getHeroList(role);
		if(msg == null){
			return;
		}else{
			session.write(msg);
		}
	}

	

}
