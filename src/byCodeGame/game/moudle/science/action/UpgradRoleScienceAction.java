package byCodeGame.game.moudle.science.action;

import org.apache.mina.core.session.IoSession;

import byCodeGame.game.cache.local.RoleCache;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.moudle.science.service.ScienceService;
import byCodeGame.game.navigation.ActionSupport;
import byCodeGame.game.remote.Message;

public class UpgradRoleScienceAction implements ActionSupport{
	private ScienceService scienceService;
	public void setScienceService(ScienceService scienceService) {
		this.scienceService = scienceService;
	}
	
	public void execute(Message message, IoSession session) {
		Message msg = new Message();
		Role role = RoleCache.getRoleBySession(session);
		int type = message.getInt();
		
		msg = scienceService.upgradeRoleScience(role, type);
		if(msg == null)
		{
			return;
		}else {
			session.write(msg);
		}
	}
}