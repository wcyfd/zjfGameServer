package byCodeGame.game.moudle.inCome.action;

import org.apache.mina.core.session.IoSession;

import byCodeGame.game.cache.local.RoleCache;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.moudle.inCome.service.InComeService;
import byCodeGame.game.navigation.ActionSupport;
import byCodeGame.game.remote.Message;

public class BuildTypeLvUpAction implements ActionSupport {

	private InComeService inComeService;
	public void setInComeService(InComeService inComeService) {
		this.inComeService = inComeService;
	}
	
	@Override
	public void execute(Message message, IoSession session) {
		byte type = message.get();
		Role role = RoleCache.getRoleBySession(session);
		
		Message msg = inComeService.buildTypeLvUp(role, type);
		if(msg == null){
			return;
		}else{
			session.write(msg);
		}
	}

}