using System;
using System.Drawing;
using System.Windows.Forms;

namespace AuxiliosFamiliares
{
    public partial class LoginWindow : Form
    {
        private bool viewPassState = true;
        private int fails = 0;
        private int time = 0;
        private int failsTimes = 1;
        private int waitTime = 10;
        private int timeToWait;

        public LoginWindow()
        {
            InitializeComponent();
        }

        private void ButtonViewPass_Click(object sender, EventArgs e)
        {
            if (viewPassState)
            {
                viewPassState = false;
                buttonViewPass.Text = "Ocultar";
                textBoxPassword.PasswordChar = '\0';
            }
            else
            {
                viewPassState = true;
                buttonViewPass.Text = "Ver";
                textBoxPassword.PasswordChar = '*';
            }
        }

        private void ButtonExit_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void ButtonLogin_Click(object sender, EventArgs e)
        {
            string name = "Pepe";
            string password = "pepe123";

            if (fails <= 3)
            {
                if (textBoxName.Text.Equals(name) && textBoxPassword.Text.Equals(password))
                {

                }
                else
                {
                    fails += 1;
                    MessageBox.Show(String.Format("Credenciales incorrectas, le quedan {0} intento(s).", 3 - fails), "Error");
                }
            }
            else
            {
                MessageBox.Show("Ha superado sus intentos, intentelo mas tarde", "Error");
                timerFails.Enabled = true;
                labelTimeToResetFails.Visible = true;
                buttonLogin.Enabled = false;
                buttonLogin.BackColor = Color.FromArgb(240, 240, 240);
            }
        }

        private void ResetFails(object sender, EventArgs e)
        {
            timeToWait = waitTime * failsTimes;
            time += 1;
            labelTimeToResetFails.Text = time.ToString();

            if (time == timeToWait)
            {
                timerFails.Enabled = false;
                labelTimeToResetFails.Visible = false;
                labelTimeToResetFails.Text = "0";
                failsTimes += 1;
                buttonLogin.Enabled = true;
                buttonLogin.BackColor = Color.FromArgb(192, 255, 192);
            }
        }
    }
}
