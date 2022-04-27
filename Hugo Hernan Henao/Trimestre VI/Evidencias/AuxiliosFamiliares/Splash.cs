using System;
using System.Windows.Forms;

namespace AuxiliosFamiliares
{
    public partial class SplashWindow : Form
    {
        private int interval = 0;

        public SplashWindow()
        {
            InitializeComponent();
        }

        private void timerTitle_Tick(object sender, EventArgs e)
        {
            interval += 1;
            progressBarLoading.Value = interval;
            switch (interval)
            {
                case 1:
                    labelTitle.Text = "B";
                    break;
                case 2:
                    labelTitle.Text += "I";
                    break;
                case 3:
                    labelTitle.Text += "E";
                    break;
                case 4:
                    labelTitle.Text += "N";
                    break;
                case 5:
                    labelTitle.Text += "V";
                    break;
                case 6:
                    labelTitle.Text += "E";
                    break;
                case 7:
                    labelTitle.Text += "N";
                    break;
                case 8:
                    labelTitle.Text += "I";
                    break;
                case 9:
                    labelTitle.Text += "D";
                    break;
                case 10:
                    labelTitle.Text += "O";
                    timerTitle.Interval = 500;
                    break;
                default:
                    timerTitle.Enabled = false;
                    progressBarLoading.Visible = false;
                    Hide();
                    new LoginWindow().Show();
                    break;
            }
        }
    }
}
