package byCodeGame.game.moudle.inCome.action;

import org.apache.mina.core.session.IoSession;

import byCodeGame.game.cache.local.RoleCache;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.moudle.inCome.service.InComeService;
import byCodeGame.game.navigation.ActionSupport;
import byCodeGame.game.remote.Message;

public class InComeShowLevyInfoAction implements ActionSupport {

	private InComeService inComeService;
	public void setInComeService(InComeService inComeService) {
		this.inComeService = inComeService;
	}
	
	@Override
	public void execute(Message message, IoSession session) {		
		Role role = RoleCache.getRoleBySession(session);
		byte type = message.get();
		int heroId = message.getInt();
		Message msg = inComeService.showLevyInfo(role,type,heroId);
		if(msg == null){
			return;
		}else{
			session.write(msg);
		}
	}

}
