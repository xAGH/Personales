module.exports = {
  mode:'jit',
  purge: [
    './src/**/*.html',
    './src/**/*.js',
  ],
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {
      backgroundImage: {
        'banner': "url('https://raw.githubusercontent.com/xAGH/SolutionIPS/main/frontend/src/assets/banner.jpg')", 
      }, gridTemplateRows: {
        '35/65': '35vh 65vh'
      }
    }
  },
  variants: {
    extend: {},
  },
  plugins: [],
}
