package byCodeGame.game.moudle.legion.action;

import org.apache.mina.core.session.IoSession;

import byCodeGame.game.cache.local.RoleCache;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.moudle.legion.service.LegionService;
import byCodeGame.game.navigation.ActionSupport;
import byCodeGame.game.remote.Message;

public class CreatLegionAction implements ActionSupport {

	private LegionService legionService;
	public void setLegionService(LegionService legionService) {
		this.legionService = legionService;
	}
	
	@Override
	public void execute(Message message, IoSession session) {
		Role role = RoleCache.getRoleBySession(session);
		String name = message.getString(session);
		String shortName = message.getString(session);
		
		Message msg = legionService.creatLegion(role, name ,shortName);
		if(msg == null){
			return;
		}else{
			session.write(msg);
		}
	}

	

}