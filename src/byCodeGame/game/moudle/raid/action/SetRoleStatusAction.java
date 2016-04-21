package byCodeGame.game.moudle.raid.action;

import org.apache.mina.core.session.IoSession;

import byCodeGame.game.cache.local.RoleCache;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.moudle.raid.service.RaidService;
import byCodeGame.game.navigation.ActionSupport;
import byCodeGame.game.remote.Message;

public class SetRoleStatusAction implements ActionSupport{
	private RaidService raidService;
	public void setRaidService(RaidService raidService) {
		this.raidService = raidService;
	}
	
	
	public void execute(Message message, IoSession session) {
		Message msg = new Message();
		Role role = RoleCache.getRoleBySession(session);
		byte status = message.get();
		
		msg = raidService.setRoleStatus(role, status);
		if(msg == null)
		{
			return;
		}else {
			session.write(msg);
		}
	}
	
}
