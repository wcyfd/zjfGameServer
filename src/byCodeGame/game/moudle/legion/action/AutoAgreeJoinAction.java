package byCodeGame.game.moudle.legion.action;

import org.apache.mina.core.session.IoSession;

import byCodeGame.game.cache.local.LegionCache;
import byCodeGame.game.cache.local.RoleCache;
import byCodeGame.game.entity.bo.Legion;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.moudle.legion.service.LegionService;
import byCodeGame.game.navigation.ActionSupport;
import byCodeGame.game.remote.Message;

public class AutoAgreeJoinAction implements ActionSupport{
	private LegionService legionService;
	public void setLegionService(LegionService legionService) {
		this.legionService = legionService;
	}
	
	public void execute(Message message, IoSession session) {
		Message msg = new Message();
		Role role = RoleCache.getRoleBySession(session);
		Legion legion = LegionCache.getLegionById(role.getLegionId());
		byte type = message.get();
		int minLv = message.getInt();
		
		msg = legionService.setAutoAgreeJoin(role, legion, type, minLv);
		if(msg == null)
		{
			return;
		}else {
			session.write(msg);
		}
	}
}
