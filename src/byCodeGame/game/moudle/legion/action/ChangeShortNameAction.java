package byCodeGame.game.moudle.legion.action;

import org.apache.mina.core.session.IoSession;

import byCodeGame.game.cache.local.RoleCache;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.moudle.legion.service.LegionService;
import byCodeGame.game.navigation.ActionSupport;
import byCodeGame.game.remote.Message;

public class ChangeShortNameAction implements ActionSupport{
	private LegionService legionService;
	public void setLegionService(LegionService legionService) {
		this.legionService = legionService;
	}
	
	public void execute(Message message, IoSession session) {
		Message msg = new Message();
		Role role = RoleCache.getRoleBySession(session);
		String shortName = message.getString(session);
		
		msg = legionService.changeShortName(role, shortName);
		if(msg == null)
		{
			return;
		}else {
			session.write(msg);
		}
	}
}
