package com.linewell.core.view.ext.data;

import javax.servlet.http.HttpServletRequest;

public class TestDataInfo implements ViewDataInf {

	@Override
	public String getViewData(HttpServletRequest request) {
		
		return "{\"total\":71,\"rows\":[{\"VIEW_UNID\":\"A764F1E4018F63147090CC539913DDD0\",\"VIEW_NAME\":\"共享库-材料管理\",\"VIEW_ALIAS\":\"ShareLibAttr\",\"VIEW_JNDI\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_TYPE\":\"1\",\"VIEW_SHOW_TYPE\":\"0\",\"VIEW_PAGE_SIZE\":\"\",\"VIEW_SOURCE_TYPE\":\"1\",\"VIEW_CUSTOM\":\"\",\"VIEW_FORM_UNID\":\"\",\"VIEW_OPEN_TYPE\":\"1\",\"VIEW_OPEN_CONTENT\":\"/core/sharelib/sharelib_attr_edit.jsp?unid=\",\"VIEW_TREE_CLASS\":\"com.linewell.core.sharelib.user.ShareLibUserTree\",\"VIEW_PARAMS_CLASS\":\"\",\"VIEW_SEARCH_STYLE\":\"\",\"VIEW_CATEGORY\":\"\",\"VIEW_WIDTH\":\"600\",\"VIEW_HEIGHT\":\"400\",\"VIEW_ROWNUMBERS\":\"1\",\"APP_UNID\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_DATA_CLASS\":\"\",\"VIEW_SQL\":\"SELECT A.UNID,A.FILENAME,B.NAME,A.EXPIRY_DATE \\nFROM SHARELIB_ATTR A,SHARELIB_USER B \\nWHERE A.BELONGTO=B.UNID AND A.FILENAME LIKE '%${FILENAME}%'\\nAND A.BELONGTO LIKE '%${USERUNID}%'\",\"RN\":\"1\"},{\"VIEW_UNID\":\"5435629A98754A68F744807EA13BADE6\",\"VIEW_NAME\":\"补件业务\",\"VIEW_ALIAS\":\"ApasInfo\",\"VIEW_JNDI\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_TYPE\":\"0\",\"VIEW_SHOW_TYPE\":\"0\",\"VIEW_PAGE_SIZE\":\"\",\"VIEW_SOURCE_TYPE\":\"1\",\"VIEW_CUSTOM\":\"\",\"VIEW_FORM_UNID\":\"\",\"VIEW_OPEN_TYPE\":\"1\",\"VIEW_OPEN_CONTENT\":\"was/jsp/info/document/document.jsp?unid=\",\"VIEW_TREE_CLASS\":\"\",\"VIEW_PARAMS_CLASS\":\"\",\"VIEW_SEARCH_STYLE\":\"\",\"VIEW_CATEGORY\":\"\",\"VIEW_WIDTH\":\"800\",\"VIEW_HEIGHT\":\"500\",\"VIEW_ROWNUMBERS\":\"1\",\"APP_UNID\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_DATA_CLASS\":\"\",\"VIEW_SQL\":\"SELECT A.UNID,A.PROJECTNAME,A.APPLYNAME,A.ACCEPT_TIME,B.SDATETIME,B.MEMO\\nFROM APAS_INFO A,APAS_TIMES B \\nWHERE A.UNID=B.PUNID AND B.ISUSED='N' AND SUSER='#{USER_DISPLAY_NAME}'\\n  AND RECEIVE_USERID IS NOT NULL \\n  AND INSTR('补件',HANDLESTATE) > 0 \\nAND A.RECEIVE_DEPTID = '#{DEPT_UNID}'\\n  AND NVL(PROJECTNAME,' ') LIKE '%${PROJECTNAME}%'\\n ORDER BY ACCEPT_TIME DESC\",\"RN\":\"2\"},{\"VIEW_UNID\":\"A5FC8D5179C854A5F410C7DC873F1B95\",\"VIEW_NAME\":\"预审补件\",\"VIEW_ALIAS\":\"ApasInfo\",\"VIEW_JNDI\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_TYPE\":\"0\",\"VIEW_SHOW_TYPE\":\"0\",\"VIEW_PAGE_SIZE\":\"\",\"VIEW_SOURCE_TYPE\":\"1\",\"VIEW_CUSTOM\":\"\",\"VIEW_FORM_UNID\":\"\",\"VIEW_OPEN_TYPE\":\"1\",\"VIEW_OPEN_CONTENT\":\"was/jsp/info/bussiness/apasinfo_commonform_edit.jsp?unid=\",\"VIEW_TREE_CLASS\":\"\",\"VIEW_PARAMS_CLASS\":\"\",\"VIEW_SEARCH_STYLE\":\"\",\"VIEW_CATEGORY\":\"\",\"VIEW_WIDTH\":\"900\",\"VIEW_HEIGHT\":\"600\",\"VIEW_ROWNUMBERS\":\"1\",\"APP_UNID\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_DATA_CLASS\":\"\",\"VIEW_SQL\":\"SELECT *  FROM APAS_INFO\\n WHERE INSTR('预审补件', HANDLESTATE) > 0\\n   AND NVL(PROJECTNAME,' ') LIKE '%${PROJECTNAME}%'  \\n   AND RECEIVE_DEPTID = '#{DEPT_UNID}'\\n ORDER BY NODE_STIME DESC\",\"RN\":\"3\"},{\"VIEW_UNID\":\"5754A1ED024051D3B04BCEBD1D913FF6\",\"VIEW_NAME\":\"预登记-年检预登记\",\"VIEW_ALIAS\":\"AdvanceInfo\",\"VIEW_JNDI\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_TYPE\":\"0\",\"VIEW_SHOW_TYPE\":\"0\",\"VIEW_PAGE_SIZE\":\"\",\"VIEW_SOURCE_TYPE\":\"1\",\"VIEW_CUSTOM\":\"\",\"VIEW_FORM_UNID\":\"\",\"VIEW_OPEN_TYPE\":\"1\",\"VIEW_OPEN_CONTENT\":\"/was/jsp/advance/advanceInfo_detail.jsp?unid=\",\"VIEW_TREE_CLASS\":\"\",\"VIEW_PARAMS_CLASS\":\"\",\"VIEW_SEARCH_STYLE\":\"0\",\"VIEW_CATEGORY\":\"\",\"VIEW_WIDTH\":\"800\",\"VIEW_HEIGHT\":\"500\",\"VIEW_ROWNUMBERS\":\"1\",\"APP_UNID\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_DATA_CLASS\":\"\",\"VIEW_SQL\":\"SELECT * FROM ADVANCE_INFO WHERE TYPE='年检' \\nAND APPLYNAME LIKE '%${APPLYNAME}%'\\nAND PROJECTNAME LIKE '%${PROJECTNAME}%'\\nAND ADVANCE_CODE LIKE '%${ADVANCE_CODE}%'\\nORDER BY CREATE_TIME DESC\\n\",\"RN\":\"4\"},{\"VIEW_UNID\":\"E3BD2179192C4CAFC5E814F87CCDC697\",\"VIEW_NAME\":\"已办业务\",\"VIEW_ALIAS\":\"ApasInfo\",\"VIEW_JNDI\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_TYPE\":\"0\",\"VIEW_SHOW_TYPE\":\"0\",\"VIEW_PAGE_SIZE\":\"\",\"VIEW_SOURCE_TYPE\":\"1\",\"VIEW_CUSTOM\":\"\",\"VIEW_FORM_UNID\":\"\",\"VIEW_OPEN_TYPE\":\"1\",\"VIEW_OPEN_CONTENT\":\"was/jsp/info/document/document.jsp?unid=\",\"VIEW_TREE_CLASS\":\"\",\"VIEW_PARAMS_CLASS\":\"\",\"VIEW_SEARCH_STYLE\":\"\",\"VIEW_CATEGORY\":\"\",\"VIEW_WIDTH\":\"800\",\"VIEW_HEIGHT\":\"500\",\"VIEW_ROWNUMBERS\":\"1\",\"APP_UNID\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_DATA_CLASS\":\"\",\"VIEW_SQL\":\"SELECT * FROM APAS_INFO WHERE \\nRECEIVE_USERID IS NOT NULL \\nAND  INSTR('办结',HANDLESTATE) > 0 \\nAND NVL(PROJECTNAME,' ') LIKE '%${PROJECTNAME}%' \\nAND RECEIVE_DEPTID = '#{DEPT_UNID}'\\nAND APPLYNAME LIKE '%${APPLYNAME}%'\\nAND SUBSTR(TRANSACT_TIME,0,10) BETWEEN '${BEGINTIME}' AND '${ENDTIME}'\\n${GET_TIME}\\nORDER BY TRANSACT_TIME DESC\",\"RN\":\"5\"},{\"VIEW_UNID\":\"B369E053C83ABB44A118725975D2D001\",\"VIEW_NAME\":\"字典配置\",\"VIEW_ALIAS\":\"dict\",\"VIEW_JNDI\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_TYPE\":\"0\",\"VIEW_SHOW_TYPE\":\"0\",\"VIEW_PAGE_SIZE\":\"\",\"VIEW_SOURCE_TYPE\":\"1\",\"VIEW_CUSTOM\":\"\",\"VIEW_FORM_UNID\":\"\",\"VIEW_OPEN_TYPE\":\"1\",\"VIEW_OPEN_CONTENT\":\"core/dict/dict_edit.jsp?unid=\",\"VIEW_TREE_CLASS\":\"\",\"VIEW_PARAMS_CLASS\":\"\",\"VIEW_SEARCH_STYLE\":\"5\",\"VIEW_CATEGORY\":\"\",\"VIEW_WIDTH\":\"500\",\"VIEW_HEIGHT\":\"300\",\"VIEW_ROWNUMBERS\":\"1\",\"APP_UNID\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_DATA_CLASS\":\"\",\"VIEW_SQL\":\"SELECT * FROM APAS_DICT T WHERE DICTNAME LIKE '%${DICTNAME}%' AND DICTTYPE LIKE '%${DICTTYPE}%' ORDER BY DICTTYPE\",\"RN\":\"6\"},{\"VIEW_UNID\":\"E44CD321CC8A15EC5B38C8723505D6E9\",\"VIEW_NAME\":\"收件管理\",\"VIEW_ALIAS\":\"ApasInfo\",\"VIEW_JNDI\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_TYPE\":\"0\",\"VIEW_SHOW_TYPE\":\"0\",\"VIEW_PAGE_SIZE\":\"\",\"VIEW_SOURCE_TYPE\":\"1\",\"VIEW_CUSTOM\":\"\",\"VIEW_FORM_UNID\":\"\",\"VIEW_OPEN_TYPE\":\"1\",\"VIEW_OPEN_CONTENT\":\"was/jsp/info/bussiness/apasinfo_commonform_edit.jsp?unid=\",\"VIEW_TREE_CLASS\":\"\",\"VIEW_PARAMS_CLASS\":\"\",\"VIEW_SEARCH_STYLE\":\"\",\"VIEW_CATEGORY\":\"\",\"VIEW_WIDTH\":\"1000\",\"VIEW_HEIGHT\":\"720\",\"VIEW_ROWNUMBERS\":\"1\",\"APP_UNID\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_DATA_CLASS\":\"\",\"VIEW_SQL\":\"SELECT *  FROM APAS_INFO\\n WHERE INSTR('收件', HANDLESTATE) > 0\\n   AND NVL(PROJECTNAME,' ') LIKE '%${PROJECTNAME}%'  \\n   AND RECEIVE_DEPTID = '#{DEPT_UNID}'\\n ORDER BY NODE_STIME DESC\",\"RN\":\"7\"},{\"VIEW_UNID\":\"95A2584A1B567AA03ED80253C5E0C57A\",\"VIEW_NAME\":\"办件预审\",\"VIEW_ALIAS\":\"ApasInfo\",\"VIEW_JNDI\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_TYPE\":\"0\",\"VIEW_SHOW_TYPE\":\"0\",\"VIEW_PAGE_SIZE\":\"\",\"VIEW_SOURCE_TYPE\":\"1\",\"VIEW_CUSTOM\":\"\",\"VIEW_FORM_UNID\":\"\",\"VIEW_OPEN_TYPE\":\"1\",\"VIEW_OPEN_CONTENT\":\"was/jsp/info/bussiness/apasinfo_commonform_edit.jsp?unid=\",\"VIEW_TREE_CLASS\":\"\",\"VIEW_PARAMS_CLASS\":\"\",\"VIEW_SEARCH_STYLE\":\"\",\"VIEW_CATEGORY\":\"\",\"VIEW_WIDTH\":\"900\",\"VIEW_HEIGHT\":\"600\",\"VIEW_ROWNUMBERS\":\"1\",\"APP_UNID\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_DATA_CLASS\":\"\",\"VIEW_SQL\":\"SELECT *  FROM APAS_INFO\\n WHERE INSTR('预审', HANDLESTATE) > 0\\n   AND NVL(PROJECTNAME,' ') LIKE '%${PROJECTNAME}%'  \\n   AND RECEIVE_DEPTID = '#{DEPT_UNID}'\\n ORDER BY NODE_STIME DESC\",\"RN\":\"8\"},{\"VIEW_UNID\":\"7EDE4262A5D653C612AAED49B2144246\",\"VIEW_NAME\":\"办事大厅_在线投诉\",\"VIEW_ALIAS\":\"ptlcomplain\",\"VIEW_JNDI\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_TYPE\":\"1\",\"VIEW_SHOW_TYPE\":\"0\",\"VIEW_PAGE_SIZE\":\"\",\"VIEW_SOURCE_TYPE\":\"1\",\"VIEW_CUSTOM\":\"\",\"VIEW_FORM_UNID\":\"\",\"VIEW_OPEN_TYPE\":\"1\",\"VIEW_OPEN_CONTENT\":\"was/jsp/ptl/complain/ptlcomplain_edit.jsp?unid=\",\"VIEW_TREE_CLASS\":\"com.linewell.tree.impl.DeptTree\",\"VIEW_PARAMS_CLASS\":\"\",\"VIEW_SEARCH_STYLE\":\"\",\"VIEW_CATEGORY\":\"\",\"VIEW_WIDTH\":\"680\",\"VIEW_HEIGHT\":\"500\",\"VIEW_ROWNUMBERS\":\"1\",\"APP_UNID\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_DATA_CLASS\":\"\",\"VIEW_SQL\":\"SELECT * FROM PTL_COMPLAIN T\",\"RN\":\"9\"},{\"VIEW_UNID\":\"3EEC875425D440F09C764C71DA7FD7EA\",\"VIEW_NAME\":\"延时业务查询\",\"VIEW_ALIAS\":\"ApasDelaySearch\",\"VIEW_JNDI\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_TYPE\":\"0\",\"VIEW_SHOW_TYPE\":\"0\",\"VIEW_PAGE_SIZE\":\"\",\"VIEW_SOURCE_TYPE\":\"1\",\"VIEW_CUSTOM\":\"\",\"VIEW_FORM_UNID\":\"\",\"VIEW_OPEN_TYPE\":\"1\",\"VIEW_OPEN_CONTENT\":\"was/jsp/info/document/document.jsp?unid=\",\"VIEW_TREE_CLASS\":\"\",\"VIEW_PARAMS_CLASS\":\"\",\"VIEW_SEARCH_STYLE\":\"5\",\"VIEW_CATEGORY\":\"\",\"VIEW_WIDTH\":\"680\",\"VIEW_HEIGHT\":\"500\",\"VIEW_ROWNUMBERS\":\"1\",\"APP_UNID\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_DATA_CLASS\":\"\",\"VIEW_SQL\":\"SELECT * FROM APAS_INFO T WHERE EXISTS\\n(SELECT  D.UNID FROM APAS_INFO_DELAY  D WHERE D.PUNID=T.UNID\\n AND D.TYPE LIKE '%${TYPE}%'\\n AND SUBSTR(NVL(D.CREATETIME, '0'),0,10)>='${BEGINTIME}'\\n AND SUBSTR(NVL(D.CREATETIME, '0'),0,10)<='${ENDTIME}')\\n AND T.PROJECTNAME LIKE '%${PROJECTNAME}%'\\n\\n\",\"RN\":\"10\"},{\"VIEW_UNID\":\"BA6F7B7E23D02517282360B9A1841B1A\",\"VIEW_NAME\":\"导向台\",\"VIEW_ALIAS\":\"ApasGuide\",\"VIEW_JNDI\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_TYPE\":\"0\",\"VIEW_SHOW_TYPE\":\"0\",\"VIEW_PAGE_SIZE\":\"\",\"VIEW_SOURCE_TYPE\":\"1\",\"VIEW_CUSTOM\":\"\",\"VIEW_FORM_UNID\":\"\",\"VIEW_OPEN_TYPE\":\"1\",\"VIEW_OPEN_CONTENT\":\"was/jsp/advanceinfo/advanceinfo_edit.jsp?unid=\",\"VIEW_TREE_CLASS\":\"\",\"VIEW_PARAMS_CLASS\":\"\",\"VIEW_SEARCH_STYLE\":\"\",\"VIEW_CATEGORY\":\"\",\"VIEW_WIDTH\":\"800\",\"VIEW_HEIGHT\":\"500\",\"VIEW_ROWNUMBERS\":\"1\",\"APP_UNID\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_DATA_CLASS\":\"\",\"VIEW_SQL\":\"SELECT * FROM APAS_ADVANCEINFO T WHERE T.STATE=0 AND T.CREATE_DEPTUNID= '#{DEPT_UNID}'\\n\",\"RN\":\"11\"},{\"VIEW_UNID\":\"639F12B060A6760B85C2A816B3919F8D\",\"VIEW_NAME\":\"导向预登记_日志\",\"VIEW_ALIAS\":\"dxt_log\",\"VIEW_JNDI\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_TYPE\":\"0\",\"VIEW_SHOW_TYPE\":\"0\",\"VIEW_PAGE_SIZE\":\"\",\"VIEW_SOURCE_TYPE\":\"1\",\"VIEW_CUSTOM\":\"\",\"VIEW_FORM_UNID\":\"\",\"VIEW_OPEN_TYPE\":\"1\",\"VIEW_OPEN_CONTENT\":\"\",\"VIEW_TREE_CLASS\":\"\",\"VIEW_PARAMS_CLASS\":\"\",\"VIEW_SEARCH_STYLE\":\"\",\"VIEW_CATEGORY\":\"\",\"VIEW_WIDTH\":\"680\",\"VIEW_HEIGHT\":\"420\",\"VIEW_ROWNUMBERS\":\"1\",\"APP_UNID\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_DATA_CLASS\":\"\",\"VIEW_SQL\":\"SELECT * FROM GUIDE_LOG T\",\"RN\":\"12\"},{\"VIEW_UNID\":\"36F41263A5451EE396B7FE7A07F2A198\",\"VIEW_NAME\":\"办事大厅-在线咨询\",\"VIEW_ALIAS\":\"PtlInfo\",\"VIEW_JNDI\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_TYPE\":\"1\",\"VIEW_SHOW_TYPE\":\"0\",\"VIEW_PAGE_SIZE\":\"\",\"VIEW_SOURCE_TYPE\":\"1\",\"VIEW_CUSTOM\":\"\",\"VIEW_FORM_UNID\":\"\",\"VIEW_OPEN_TYPE\":\"1\",\"VIEW_OPEN_CONTENT\":\"was/jsp/ptl/ask/ptlask_edit.jsp?unid=\",\"VIEW_TREE_CLASS\":\"com.linewell.tree.impl.DeptTree\",\"VIEW_PARAMS_CLASS\":\"\",\"VIEW_SEARCH_STYLE\":\"0\",\"VIEW_CATEGORY\":\"\",\"VIEW_WIDTH\":\"680\",\"VIEW_HEIGHT\":\"420\",\"VIEW_ROWNUMBERS\":\"1\",\"APP_UNID\":\"02EA829BF2BA1F4FF0F49145A502C353\",\"VIEW_DATA_CLASS\":\"\",\"VIEW_SQL\":\"SELECT * FROM PTL_ASK \\n WHERE BELONGTO LIKE '%'||NVL('${ID}','-1')||'%'\\n   AND SUBJECT LIKE '%${SUBJECT}%'\\n\",\"RN\":\"13\"}]}";
	}

}