/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Util;

import com.tunisianwatch.Dao.UtilisateurDao;

/**
 *
 * @author asd
 */
public class FieldVerifier {

    public static boolean VerifOrdinaryField(String champ, String regex) {
        if (champ.length() == 0) {
            errorMsg = "Le champ est obligatroire";
            return false;
        }
        if (champ.length() > 45) {
            errorMsg = "Le champ est trop long";
            return false;
        }
        if (!champ.matches(regex)) {
            errorMsg = "Le champ contient des carractères spéciaux";
            return false;
        }
        return true;
    }

    public static boolean isNotNull(Object obj) {
        if (obj == null) {
            errorMsg = "Le champ est obligatroire";
            return false;
        }
        return true;
    }

    public static boolean VerifOrdinaryField(String champ) {
        if (champ.length() == 0) {
            errorMsg = "Le champ est obligatroire";
            return false;
        }
        if (champ.length() > 45) {
            errorMsg = "Le champ est trop long";
            return false;
        }
        return true;
    }

    public static boolean VerifComplexField(String champ, String currentValue, int type) {
        if (VerifOrdinaryField(champ)) {
            if (type == 1) { //type login
                if (existeLogin(champ, currentValue)) {
                    errorMsg = "Ce Pseudo est déjà utilisé";
                    return false;
                }
                return true;
            } else if (type == 2) {//type mail
                if (!champ.matches("^[a-zA-Z0-9\\.\\-\\_]+@([a-zA-Z0-9\\-\\_\\.]+\\.)+([a-zA-Z]{2,4})$")) {
                    errorMsg = "Ce Mail est invalide";
                    return false;
                }
                if (existeMail(champ, currentValue)) {
                    errorMsg = "Ce Mail est déjà utilisé";
                    return false;
                }
                return true;
            } else if (type == 3) {//confirmation mot de passe
                if (champ.length() < 3) {
                    errorMsg = "Le mot de passe est trop court";
                    return false;
                }
                if (!validePassword(champ, currentValue)) {
                    errorMsg = "Le mot de passe ne corréspond pas";
                    return false;
                }
            } else {
                System.err.println("type non valide");
                return false;
            }
        }
        return true;
    }

    public static boolean VerifComplexField(String champ, int type) {
        if (VerifOrdinaryField(champ)) {
            if (type == 1) { //type login
                if (existeLogin(champ)) {
                    errorMsg = "Ce Pseudo est déjà utilisé";
                    return false;
                }
                return true;
            } else if (type == 2) {//type mail
                if (!champ.matches("^[a-zA-Z0-9\\.\\-\\_]+@([a-zA-Z0-9\\-\\_\\.]+\\.)+([a-zA-Z]{2,4})$")) {
                    errorMsg = "Ce Mail est invalide";
                    return false;
                }
                if (existeMail(champ)) {
                    errorMsg = "Ce Mail est déjà utilisé";
                    return false;
                }
            } else {
                System.err.println("type non valide");
                return false;
            }
        }
        return true;
    }

    private static boolean validePassword(String pass, String confirmPass) {
        return pass.equals(confirmPass);
    }

    private static boolean existeMail(String mail, String currentMail) {
        if (!mail.equals(currentMail)) {
            UtilisateurDao userDao = new UtilisateurDao();
            if (userDao.selectUserByMail(mail) != null) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private static boolean existeLogin(String login, String currentLogin) {
        if (!currentLogin.equals(login)) {
            UtilisateurDao userDao = new UtilisateurDao();
            if (userDao.selectUserByLogin(login) != null) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private static boolean existeMail(String mail) {
        UtilisateurDao userDao = new UtilisateurDao();
        if (userDao.selectUserByMail(mail) != null) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean existeLogin(String login) {
       
            UtilisateurDao userDao = new UtilisateurDao();
            if (userDao.selectUserByLogin(login) != null) {
                return true;
            } else {
                return false;
            }
    }

    public static String errorMsg = "";

    public static String getErrorMsg() {
        return errorMsg;
    }

}
