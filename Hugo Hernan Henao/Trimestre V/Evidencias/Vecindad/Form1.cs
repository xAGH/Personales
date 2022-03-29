using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Vecindad
{
    public partial class FormPrincipal : Form
    {
        public FormPrincipal()
        {
            InitializeComponent();
        }

        private void textBox_Enter(object sender, EventArgs e)
        {
            ((TextBox)sender).BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(234)))), ((int)(((byte)(234)))), ((int)(((byte)(234)))));
        }

        private void textBox_Leave(object sender, EventArgs e)
        {
            ((TextBox)sender).BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(254)))), ((int)(((byte)(254)))));
        }

        private void textBox_TextChanged_EntradasMinimas(object sender, EventArgs e)
        {
            if (textBoxNroApto.Text.Length > 2 && textBoxDuenio.Text.Length > 0)
            {
                buttonRegistrar.Enabled = true;
                buttonRegistrar.BackColor = System.Drawing.Color.FromArgb((int)((byte)143), ((int)(byte)233), ((int)(byte)233));
            }
            else
            {
                buttonRegistrar.Enabled = false;
                buttonRegistrar.BackColor = System.Drawing.Color.FromArgb((int)((byte)200), ((int)(byte)233), ((int)(byte)233));
            }
        }

        private void textBox_KeyPress_LimitarNumeros(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar) && e.KeyChar != '.')
            {
                e.Handled = true;
            }
        }
    }
}
