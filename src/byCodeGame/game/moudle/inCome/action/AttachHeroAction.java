package byCodeGame.game.moudle.inCome.action;

import org.apache.mina.core.session.IoSession;

import byCodeGame.game.cache.local.RoleCache;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.moudle.inCome.service.InComeService;
import byCodeGame.game.navigation.ActionSupport;
import byCodeGame.game.remote.Message;

public class AttachHeroAction implements ActionSupport{
	private InComeService inComeService;
	public void setInComeService(InComeService inComeService) {
		this.inComeService = inComeService;
	}
	
	
	public void execute(Message message, IoSession session) {
		Message msg = new Message();
		Role role = RoleCache.getRoleBySession(session);
		int heroId = message.getInt();
		byte type = message.get();
		
		msg = inComeService.attachHero(role, heroId, type);
		if(msg == null)
		{
			return;
		}else {
			session.write(msg);
		}
	}
}
