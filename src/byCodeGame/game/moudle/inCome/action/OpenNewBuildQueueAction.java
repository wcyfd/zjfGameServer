package byCodeGame.game.moudle.inCome.action;

import org.apache.mina.core.session.IoSession;

import byCodeGame.game.cache.local.RoleCache;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.moudle.inCome.service.InComeService;
import byCodeGame.game.navigation.ActionSupport;
import byCodeGame.game.remote.Message;

public class OpenNewBuildQueueAction implements ActionSupport {

	private InComeService inComeService;
	public void setInComeService(InComeService inComeService) {
		this.inComeService = inComeService;
	}
	
	@Override
	public void execute(Message message, IoSession session) {
		Role role = RoleCache.getRoleBySession(session);
		Message msg = inComeService.openNewBuildQueue(role);
		if(msg == null){
			return;
		}else{
			session.write(msg);
		}
	}

}
