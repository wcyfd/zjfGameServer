package byCodeGame.game.moudle.inCome.action;

import org.apache.mina.core.session.IoSession;

import byCodeGame.game.cache.local.RoleCache;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.moudle.inCome.service.InComeService;
import byCodeGame.game.navigation.ActionSupport;
import byCodeGame.game.remote.Message;

public class GetBuildInfoAction implements ActionSupport{
	private InComeService inComeService;
	public void setInComeService(InComeService inComeService) {
		this.inComeService = inComeService;
	}
	
	public void execute(Message message, IoSession session) {
		Message msg = new Message();
		Role role = RoleCache.getRoleBySession(session);
		
		msg = inComeService.getBuildInfo(role);
		if(msg == null)
		{
			return;
		}else {
			session.write(msg);
		}
	}
}
